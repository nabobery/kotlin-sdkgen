package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The type of the tax ID, one of `ad_nrt`, `ar_cuit`, `eu_vat`, `bo_tin`, `br_cnpj`, `br_cpf`, `cn_tin`, `co_nit`,
 * `cr_tin`, `do_rcn`, `ec_ruc`, `eu_oss_vat`, `hr_oib`, `pe_ruc`, `ro_tin`, `rs_pib`, `sv_nit`, `uy_ruc`, `ve_rif`,
 * `vn_tin`, `gb_vat`, `nz_gst`, `au_abn`, `au_arn`, `in_gst`, `no_vat`, `no_voec`, `za_vat`, `ch_vat`, `mx_rfc`,
 * `sg_uen`, `ru_inn`, `ru_kpp`, `ca_bn`, `hk_br`, `es_cif`, `pl_nip`, `it_cf`, `fo_vat`, `gi_tin`, `py_ruc`, `tw_vat`,
 * `th_vat`, `jp_cn`, `jp_rn`, `jp_trn`, `li_uid`, `li_vat`, `lk_vat`, `my_itn`, `us_ein`, `kr_brn`, `ca_qst`,
 * `ca_gst_hst`, `ca_pst_bc`, `ca_pst_mb`, `ca_pst_sk`, `my_sst`, `sg_gst`, `ae_trn`, `cl_tin`, `sa_vat`, `id_npwp`,
 * `my_frp`, `il_vat`, `ge_vat`, `ua_vat`, `is_vat`, `bg_uic`, `hu_tin`, `si_tin`, `ke_pin`, `tr_tin`, `eg_tin`,
 * `ph_tin`, `al_tin`, `bh_vat`, `kz_bin`, `ng_tin`, `om_vat`, `de_stn`, `ch_uid`, `tz_vat`, `uz_vat`, `uz_tin`,
 * `md_vat`, `ma_vat`, `by_tin`, `ao_tin`, `bs_tin`, `bb_tin`, `cd_nif`, `mr_nif`, `me_pib`, `zw_tin`, `ba_tin`,
 * `gn_nif`, `mk_vat`, `sr_fin`, `sn_ninea`, `am_tin`, `np_pan`, `tj_tin`, `ug_tin`, `zm_tin`, `kh_tin`, `aw_tin`,
 * `az_tin`, `bd_bin`, `bj_ifu`, `et_tin`, `kg_tin`, `la_tin`, `cm_niu`, `cv_nif`, `bf_ifu`, or `unknown`
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_resource_customer_details_resource_tax_id/properties/typ
 * e
 */
@Serializable(with = InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d.Serializer::class)
public sealed class InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ad_nrt`.
   */
  public data object AdNrt : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ad_nrt"
  }

  /**
   * Documented value. Wire value: `ae_trn`.
   */
  public data object AeTrn : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ae_trn"
  }

  /**
   * Documented value. Wire value: `al_tin`.
   */
  public data object AlTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "al_tin"
  }

  /**
   * Documented value. Wire value: `am_tin`.
   */
  public data object AmTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "am_tin"
  }

  /**
   * Documented value. Wire value: `ao_tin`.
   */
  public data object AoTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ao_tin"
  }

  /**
   * Documented value. Wire value: `ar_cuit`.
   */
  public data object ArCuit : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ar_cuit"
  }

  /**
   * Documented value. Wire value: `au_abn`.
   */
  public data object AuAbn : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "au_abn"
  }

  /**
   * Documented value. Wire value: `au_arn`.
   */
  public data object AuArn : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "au_arn"
  }

  /**
   * Documented value. Wire value: `aw_tin`.
   */
  public data object AwTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "aw_tin"
  }

  /**
   * Documented value. Wire value: `az_tin`.
   */
  public data object AzTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "az_tin"
  }

  /**
   * Documented value. Wire value: `ba_tin`.
   */
  public data object BaTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ba_tin"
  }

  /**
   * Documented value. Wire value: `bb_tin`.
   */
  public data object BbTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "bb_tin"
  }

  /**
   * Documented value. Wire value: `bd_bin`.
   */
  public data object BdBin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "bd_bin"
  }

  /**
   * Documented value. Wire value: `bf_ifu`.
   */
  public data object BfIfu : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "bf_ifu"
  }

  /**
   * Documented value. Wire value: `bg_uic`.
   */
  public data object BgUic : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "bg_uic"
  }

  /**
   * Documented value. Wire value: `bh_vat`.
   */
  public data object BhVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "bh_vat"
  }

  /**
   * Documented value. Wire value: `bj_ifu`.
   */
  public data object BjIfu : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "bj_ifu"
  }

  /**
   * Documented value. Wire value: `bo_tin`.
   */
  public data object BoTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "bo_tin"
  }

  /**
   * Documented value. Wire value: `br_cnpj`.
   */
  public data object BrCnpj : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "br_cnpj"
  }

  /**
   * Documented value. Wire value: `br_cpf`.
   */
  public data object BrCpf : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "br_cpf"
  }

  /**
   * Documented value. Wire value: `bs_tin`.
   */
  public data object BsTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "bs_tin"
  }

  /**
   * Documented value. Wire value: `by_tin`.
   */
  public data object ByTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "by_tin"
  }

  /**
   * Documented value. Wire value: `ca_bn`.
   */
  public data object CaBn : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ca_bn"
  }

  /**
   * Documented value. Wire value: `ca_gst_hst`.
   */
  public data object CaGstHst : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ca_gst_hst"
  }

  /**
   * Documented value. Wire value: `ca_pst_bc`.
   */
  public data object CaPstBc : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ca_pst_bc"
  }

  /**
   * Documented value. Wire value: `ca_pst_mb`.
   */
  public data object CaPstMb : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ca_pst_mb"
  }

  /**
   * Documented value. Wire value: `ca_pst_sk`.
   */
  public data object CaPstSk : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ca_pst_sk"
  }

  /**
   * Documented value. Wire value: `ca_qst`.
   */
  public data object CaQst : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ca_qst"
  }

  /**
   * Documented value. Wire value: `cd_nif`.
   */
  public data object CdNif : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "cd_nif"
  }

  /**
   * Documented value. Wire value: `ch_uid`.
   */
  public data object ChUid : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ch_uid"
  }

  /**
   * Documented value. Wire value: `ch_vat`.
   */
  public data object ChVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ch_vat"
  }

  /**
   * Documented value. Wire value: `cl_tin`.
   */
  public data object ClTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "cl_tin"
  }

  /**
   * Documented value. Wire value: `cm_niu`.
   */
  public data object CmNiu : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "cm_niu"
  }

  /**
   * Documented value. Wire value: `cn_tin`.
   */
  public data object CnTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "cn_tin"
  }

  /**
   * Documented value. Wire value: `co_nit`.
   */
  public data object CoNit : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "co_nit"
  }

  /**
   * Documented value. Wire value: `cr_tin`.
   */
  public data object CrTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "cr_tin"
  }

  /**
   * Documented value. Wire value: `cv_nif`.
   */
  public data object CvNif : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "cv_nif"
  }

  /**
   * Documented value. Wire value: `de_stn`.
   */
  public data object DeStn : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "de_stn"
  }

  /**
   * Documented value. Wire value: `do_rcn`.
   */
  public data object DoRcn : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "do_rcn"
  }

  /**
   * Documented value. Wire value: `ec_ruc`.
   */
  public data object EcRuc : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ec_ruc"
  }

  /**
   * Documented value. Wire value: `eg_tin`.
   */
  public data object EgTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "eg_tin"
  }

  /**
   * Documented value. Wire value: `es_cif`.
   */
  public data object EsCif : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "es_cif"
  }

  /**
   * Documented value. Wire value: `et_tin`.
   */
  public data object EtTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "et_tin"
  }

  /**
   * Documented value. Wire value: `eu_oss_vat`.
   */
  public data object EuOssVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "eu_oss_vat"
  }

  /**
   * Documented value. Wire value: `eu_vat`.
   */
  public data object EuVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "eu_vat"
  }

  /**
   * Documented value. Wire value: `fo_vat`.
   */
  public data object FoVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "fo_vat"
  }

  /**
   * Documented value. Wire value: `gb_vat`.
   */
  public data object GbVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "gb_vat"
  }

  /**
   * Documented value. Wire value: `ge_vat`.
   */
  public data object GeVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ge_vat"
  }

  /**
   * Documented value. Wire value: `gi_tin`.
   */
  public data object GiTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "gi_tin"
  }

  /**
   * Documented value. Wire value: `gn_nif`.
   */
  public data object GnNif : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "gn_nif"
  }

  /**
   * Documented value. Wire value: `hk_br`.
   */
  public data object HkBr : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "hk_br"
  }

  /**
   * Documented value. Wire value: `hr_oib`.
   */
  public data object HrOib : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "hr_oib"
  }

  /**
   * Documented value. Wire value: `hu_tin`.
   */
  public data object HuTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "hu_tin"
  }

  /**
   * Documented value. Wire value: `id_npwp`.
   */
  public data object IdNpwp : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "id_npwp"
  }

  /**
   * Documented value. Wire value: `il_vat`.
   */
  public data object IlVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "il_vat"
  }

  /**
   * Documented value. Wire value: `in_gst`.
   */
  public data object InGst : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "in_gst"
  }

  /**
   * Documented value. Wire value: `is_vat`.
   */
  public data object IsVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "is_vat"
  }

  /**
   * Documented value. Wire value: `it_cf`.
   */
  public data object ItCf : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "it_cf"
  }

  /**
   * Documented value. Wire value: `jp_cn`.
   */
  public data object JpCn : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "jp_cn"
  }

  /**
   * Documented value. Wire value: `jp_rn`.
   */
  public data object JpRn : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "jp_rn"
  }

  /**
   * Documented value. Wire value: `jp_trn`.
   */
  public data object JpTrn : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "jp_trn"
  }

  /**
   * Documented value. Wire value: `ke_pin`.
   */
  public data object KePin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ke_pin"
  }

  /**
   * Documented value. Wire value: `kg_tin`.
   */
  public data object KgTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "kg_tin"
  }

  /**
   * Documented value. Wire value: `kh_tin`.
   */
  public data object KhTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "kh_tin"
  }

  /**
   * Documented value. Wire value: `kr_brn`.
   */
  public data object KrBrn : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "kr_brn"
  }

  /**
   * Documented value. Wire value: `kz_bin`.
   */
  public data object KzBin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "kz_bin"
  }

  /**
   * Documented value. Wire value: `la_tin`.
   */
  public data object LaTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "la_tin"
  }

  /**
   * Documented value. Wire value: `li_uid`.
   */
  public data object LiUid : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "li_uid"
  }

  /**
   * Documented value. Wire value: `li_vat`.
   */
  public data object LiVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "li_vat"
  }

  /**
   * Documented value. Wire value: `lk_vat`.
   */
  public data object LkVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "lk_vat"
  }

  /**
   * Documented value. Wire value: `ma_vat`.
   */
  public data object MaVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ma_vat"
  }

  /**
   * Documented value. Wire value: `md_vat`.
   */
  public data object MdVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "md_vat"
  }

  /**
   * Documented value. Wire value: `me_pib`.
   */
  public data object MePib : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "me_pib"
  }

  /**
   * Documented value. Wire value: `mk_vat`.
   */
  public data object MkVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "mk_vat"
  }

  /**
   * Documented value. Wire value: `mr_nif`.
   */
  public data object MrNif : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "mr_nif"
  }

  /**
   * Documented value. Wire value: `mx_rfc`.
   */
  public data object MxRfc : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "mx_rfc"
  }

  /**
   * Documented value. Wire value: `my_frp`.
   */
  public data object MyFrp : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "my_frp"
  }

  /**
   * Documented value. Wire value: `my_itn`.
   */
  public data object MyItn : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "my_itn"
  }

  /**
   * Documented value. Wire value: `my_sst`.
   */
  public data object MySst : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "my_sst"
  }

  /**
   * Documented value. Wire value: `ng_tin`.
   */
  public data object NgTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ng_tin"
  }

  /**
   * Documented value. Wire value: `no_vat`.
   */
  public data object NoVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "no_vat"
  }

  /**
   * Documented value. Wire value: `no_voec`.
   */
  public data object NoVoec : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "no_voec"
  }

  /**
   * Documented value. Wire value: `np_pan`.
   */
  public data object NpPan : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "np_pan"
  }

  /**
   * Documented value. Wire value: `nz_gst`.
   */
  public data object NzGst : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "nz_gst"
  }

  /**
   * Documented value. Wire value: `om_vat`.
   */
  public data object OmVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "om_vat"
  }

  /**
   * Documented value. Wire value: `pe_ruc`.
   */
  public data object PeRuc : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "pe_ruc"
  }

  /**
   * Documented value. Wire value: `ph_tin`.
   */
  public data object PhTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ph_tin"
  }

  /**
   * Documented value. Wire value: `pl_nip`.
   */
  public data object PlNip : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "pl_nip"
  }

  /**
   * Documented value. Wire value: `py_ruc`.
   */
  public data object PyRuc : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "py_ruc"
  }

  /**
   * Documented value. Wire value: `ro_tin`.
   */
  public data object RoTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ro_tin"
  }

  /**
   * Documented value. Wire value: `rs_pib`.
   */
  public data object RsPib : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "rs_pib"
  }

  /**
   * Documented value. Wire value: `ru_inn`.
   */
  public data object RuInn : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ru_inn"
  }

  /**
   * Documented value. Wire value: `ru_kpp`.
   */
  public data object RuKpp : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ru_kpp"
  }

  /**
   * Documented value. Wire value: `sa_vat`.
   */
  public data object SaVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "sa_vat"
  }

  /**
   * Documented value. Wire value: `sg_gst`.
   */
  public data object SgGst : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "sg_gst"
  }

  /**
   * Documented value. Wire value: `sg_uen`.
   */
  public data object SgUen : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "sg_uen"
  }

  /**
   * Documented value. Wire value: `si_tin`.
   */
  public data object SiTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "si_tin"
  }

  /**
   * Documented value. Wire value: `sn_ninea`.
   */
  public data object SnNinea : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "sn_ninea"
  }

  /**
   * Documented value. Wire value: `sr_fin`.
   */
  public data object SrFin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "sr_fin"
  }

  /**
   * Documented value. Wire value: `sv_nit`.
   */
  public data object SvNit : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "sv_nit"
  }

  /**
   * Documented value. Wire value: `th_vat`.
   */
  public data object ThVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "th_vat"
  }

  /**
   * Documented value. Wire value: `tj_tin`.
   */
  public data object TjTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "tj_tin"
  }

  /**
   * Documented value. Wire value: `tr_tin`.
   */
  public data object TrTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "tr_tin"
  }

  /**
   * Documented value. Wire value: `tw_vat`.
   */
  public data object TwVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "tw_vat"
  }

  /**
   * Documented value. Wire value: `tz_vat`.
   */
  public data object TzVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "tz_vat"
  }

  /**
   * Documented value. Wire value: `ua_vat`.
   */
  public data object UaVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ua_vat"
  }

  /**
   * Documented value. Wire value: `ug_tin`.
   */
  public data object UgTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ug_tin"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "unknown"
  }

  /**
   * Documented value. Wire value: `us_ein`.
   */
  public data object UsEin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "us_ein"
  }

  /**
   * Documented value. Wire value: `uy_ruc`.
   */
  public data object UyRuc : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "uy_ruc"
  }

  /**
   * Documented value. Wire value: `uz_tin`.
   */
  public data object UzTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "uz_tin"
  }

  /**
   * Documented value. Wire value: `uz_vat`.
   */
  public data object UzVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "uz_vat"
  }

  /**
   * Documented value. Wire value: `ve_rif`.
   */
  public data object VeRif : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "ve_rif"
  }

  /**
   * Documented value. Wire value: `vn_tin`.
   */
  public data object VnTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "vn_tin"
  }

  /**
   * Documented value. Wire value: `za_vat`.
   */
  public data object ZaVat : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "za_vat"
  }

  /**
   * Documented value. Wire value: `zm_tin`.
   */
  public data object ZmTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "zm_tin"
  }

  /**
   * Documented value. Wire value: `zw_tin`.
   */
  public data object ZwTin : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d() {
    public override val `value`: String = "zw_tin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d = when (value) {
      AdNrt.value -> AdNrt
      AeTrn.value -> AeTrn
      AlTin.value -> AlTin
      AmTin.value -> AmTin
      AoTin.value -> AoTin
      ArCuit.value -> ArCuit
      AuAbn.value -> AuAbn
      AuArn.value -> AuArn
      AwTin.value -> AwTin
      AzTin.value -> AzTin
      BaTin.value -> BaTin
      BbTin.value -> BbTin
      BdBin.value -> BdBin
      BfIfu.value -> BfIfu
      BgUic.value -> BgUic
      BhVat.value -> BhVat
      BjIfu.value -> BjIfu
      BoTin.value -> BoTin
      BrCnpj.value -> BrCnpj
      BrCpf.value -> BrCpf
      BsTin.value -> BsTin
      ByTin.value -> ByTin
      CaBn.value -> CaBn
      CaGstHst.value -> CaGstHst
      CaPstBc.value -> CaPstBc
      CaPstMb.value -> CaPstMb
      CaPstSk.value -> CaPstSk
      CaQst.value -> CaQst
      CdNif.value -> CdNif
      ChUid.value -> ChUid
      ChVat.value -> ChVat
      ClTin.value -> ClTin
      CmNiu.value -> CmNiu
      CnTin.value -> CnTin
      CoNit.value -> CoNit
      CrTin.value -> CrTin
      CvNif.value -> CvNif
      DeStn.value -> DeStn
      DoRcn.value -> DoRcn
      EcRuc.value -> EcRuc
      EgTin.value -> EgTin
      EsCif.value -> EsCif
      EtTin.value -> EtTin
      EuOssVat.value -> EuOssVat
      EuVat.value -> EuVat
      FoVat.value -> FoVat
      GbVat.value -> GbVat
      GeVat.value -> GeVat
      GiTin.value -> GiTin
      GnNif.value -> GnNif
      HkBr.value -> HkBr
      HrOib.value -> HrOib
      HuTin.value -> HuTin
      IdNpwp.value -> IdNpwp
      IlVat.value -> IlVat
      InGst.value -> InGst
      IsVat.value -> IsVat
      ItCf.value -> ItCf
      JpCn.value -> JpCn
      JpRn.value -> JpRn
      JpTrn.value -> JpTrn
      KePin.value -> KePin
      KgTin.value -> KgTin
      KhTin.value -> KhTin
      KrBrn.value -> KrBrn
      KzBin.value -> KzBin
      LaTin.value -> LaTin
      LiUid.value -> LiUid
      LiVat.value -> LiVat
      LkVat.value -> LkVat
      MaVat.value -> MaVat
      MdVat.value -> MdVat
      MePib.value -> MePib
      MkVat.value -> MkVat
      MrNif.value -> MrNif
      MxRfc.value -> MxRfc
      MyFrp.value -> MyFrp
      MyItn.value -> MyItn
      MySst.value -> MySst
      NgTin.value -> NgTin
      NoVat.value -> NoVat
      NoVoec.value -> NoVoec
      NpPan.value -> NpPan
      NzGst.value -> NzGst
      OmVat.value -> OmVat
      PeRuc.value -> PeRuc
      PhTin.value -> PhTin
      PlNip.value -> PlNip
      PyRuc.value -> PyRuc
      RoTin.value -> RoTin
      RsPib.value -> RsPib
      RuInn.value -> RuInn
      RuKpp.value -> RuKpp
      SaVat.value -> SaVat
      SgGst.value -> SgGst
      SgUen.value -> SgUen
      SiTin.value -> SiTin
      SnNinea.value -> SnNinea
      SrFin.value -> SrFin
      SvNit.value -> SvNit
      ThVat.value -> ThVat
      TjTin.value -> TjTin
      TrTin.value -> TrTin
      TwVat.value -> TwVat
      TzVat.value -> TzVat
      UaVat.value -> UaVat
      UgTin.value -> UgTin
      Unknown.value -> Unknown
      UsEin.value -> UsEin
      UyRuc.value -> UyRuc
      UzTin.value -> UzTin
      UzVat.value -> UzVat
      VeRif.value -> VeRif
      VnTin.value -> VnTin
      ZaVat.value -> ZaVat
      ZmTin.value -> ZmTin
      ZwTin.value -> ZwTin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductResourceCustomerDetailsResourceTaxIdTypeXee0dc45d) {
      encoder.encodeString(value.value)
    }
  }
}
