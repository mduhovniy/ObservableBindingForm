package info.duhovniy.observablebindingform;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.text.Editable;
import android.text.TextWatcher;

/**
 * Created by maximduhovniy on 29/09/2016.
 */

public class User extends BaseObservable {
    private String firstName = "";
    private String lastName = "";

    @Bindable
    public String getFormattedName() {
        return firstName
                + ((firstName.isEmpty() || lastName.isEmpty()) ? "" : ", ")
                + lastName;
    }

    public final TextWatcher firstNameChanged = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            firstName = s.toString();
            notifyPropertyChanged(BR.formattedName);
        }
    };

    public final TextWatcher lastNameChanged = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            lastName = s.toString();
            notifyPropertyChanged(BR.formattedName);

        }
    };


}