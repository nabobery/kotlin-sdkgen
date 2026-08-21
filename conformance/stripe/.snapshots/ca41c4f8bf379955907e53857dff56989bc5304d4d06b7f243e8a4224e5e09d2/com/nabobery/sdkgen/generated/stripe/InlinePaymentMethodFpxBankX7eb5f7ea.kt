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
 * The customer's bank, if provided. Can be one of `affin_bank`, `agrobank`, `alliance_bank`, `ambank`, `bank_islam`,
 * `bank_muamalat`, `bank_rakyat`, `bsn`, `cimb`, `hong_leong_bank`, `hsbc`, `kfh`, `maybank2u`, `ocbc`, `public_bank`,
 * `rhb`, `standard_chartered`, `uob`, `deutsche_bank`, `maybank2e`, `pb_enterprise`, or `bank_of_china`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_fpx/properties/bank
 */
@Serializable(with = InlinePaymentMethodFpxBankX7eb5f7ea.Serializer::class)
public sealed class InlinePaymentMethodFpxBankX7eb5f7ea {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `affin_bank`.
   */
  public data object AffinBank : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "affin_bank"
  }

  /**
   * Documented value. Wire value: `agrobank`.
   */
  public data object Agrobank : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "agrobank"
  }

  /**
   * Documented value. Wire value: `alliance_bank`.
   */
  public data object AllianceBank : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "alliance_bank"
  }

  /**
   * Documented value. Wire value: `ambank`.
   */
  public data object Ambank : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "ambank"
  }

  /**
   * Documented value. Wire value: `bank_islam`.
   */
  public data object BankIslam : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "bank_islam"
  }

  /**
   * Documented value. Wire value: `bank_muamalat`.
   */
  public data object BankMuamalat : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "bank_muamalat"
  }

  /**
   * Documented value. Wire value: `bank_of_china`.
   */
  public data object BankOfChina : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "bank_of_china"
  }

  /**
   * Documented value. Wire value: `bank_rakyat`.
   */
  public data object BankRakyat : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "bank_rakyat"
  }

  /**
   * Documented value. Wire value: `bsn`.
   */
  public data object Bsn : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "bsn"
  }

  /**
   * Documented value. Wire value: `cimb`.
   */
  public data object Cimb : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "cimb"
  }

  /**
   * Documented value. Wire value: `deutsche_bank`.
   */
  public data object DeutscheBank : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "deutsche_bank"
  }

  /**
   * Documented value. Wire value: `hong_leong_bank`.
   */
  public data object HongLeongBank : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "hong_leong_bank"
  }

  /**
   * Documented value. Wire value: `hsbc`.
   */
  public data object Hsbc : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "hsbc"
  }

  /**
   * Documented value. Wire value: `kfh`.
   */
  public data object Kfh : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "kfh"
  }

  /**
   * Documented value. Wire value: `maybank2e`.
   */
  public data object Maybank2e : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "maybank2e"
  }

  /**
   * Documented value. Wire value: `maybank2u`.
   */
  public data object Maybank2u : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "maybank2u"
  }

  /**
   * Documented value. Wire value: `ocbc`.
   */
  public data object Ocbc : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "ocbc"
  }

  /**
   * Documented value. Wire value: `pb_enterprise`.
   */
  public data object PbEnterprise : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "pb_enterprise"
  }

  /**
   * Documented value. Wire value: `public_bank`.
   */
  public data object PublicBank : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "public_bank"
  }

  /**
   * Documented value. Wire value: `rhb`.
   */
  public data object Rhb : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "rhb"
  }

  /**
   * Documented value. Wire value: `standard_chartered`.
   */
  public data object StandardChartered : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "standard_chartered"
  }

  /**
   * Documented value. Wire value: `uob`.
   */
  public data object Uob : InlinePaymentMethodFpxBankX7eb5f7ea() {
    public override val `value`: String = "uob"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodFpxBankX7eb5f7ea()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodFpxBankX7eb5f7ea = when (value) {
      AffinBank.value -> AffinBank
      Agrobank.value -> Agrobank
      AllianceBank.value -> AllianceBank
      Ambank.value -> Ambank
      BankIslam.value -> BankIslam
      BankMuamalat.value -> BankMuamalat
      BankOfChina.value -> BankOfChina
      BankRakyat.value -> BankRakyat
      Bsn.value -> Bsn
      Cimb.value -> Cimb
      DeutscheBank.value -> DeutscheBank
      HongLeongBank.value -> HongLeongBank
      Hsbc.value -> Hsbc
      Kfh.value -> Kfh
      Maybank2e.value -> Maybank2e
      Maybank2u.value -> Maybank2u
      Ocbc.value -> Ocbc
      PbEnterprise.value -> PbEnterprise
      PublicBank.value -> PublicBank
      Rhb.value -> Rhb
      StandardChartered.value -> StandardChartered
      Uob.value -> Uob
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodFpxBankX7eb5f7ea> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodFpxBankX7eb5f7ea", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodFpxBankX7eb5f7ea = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodFpxBankX7eb5f7ea) {
      encoder.encodeString(value.value)
    }
  }
}
