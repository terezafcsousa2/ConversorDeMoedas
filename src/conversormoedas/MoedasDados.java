package conversormoedas;

public class  MoedasDados {
    private String base_code;
    private String target_code;
    private String conversion_result;

    public MoedasDados(String base_code, String target_code, String conversion_result) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_result = conversion_result;
    }

    public String getBase_code() {
        return base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public String getConversion_result() {
        return conversion_result;
    }

    @Override
    public String toString() {

        return
                //"Sigla da moeda base='" + base_code + '\'' +
                //", Sigla da moeda a converter='" + target_code + '\'' +
                "Resultado da conversão = " + conversion_result ;
    }
}
