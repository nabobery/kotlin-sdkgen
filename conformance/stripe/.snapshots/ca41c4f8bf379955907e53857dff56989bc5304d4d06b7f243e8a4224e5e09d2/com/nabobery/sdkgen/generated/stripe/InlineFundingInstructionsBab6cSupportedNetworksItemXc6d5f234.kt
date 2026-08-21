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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/funding_instructions_bank_transfer_financial_address/properties/supp
 * orted_networks/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/funding_instructions_bank_transfer_financial_address/properties/supp
 * orted_networks/items
 */
@Serializable(with = InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234.Serializer::class)
public sealed class InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234() {
    public override val `value`: String = "ach"
  }

  /**
   * Documented value. Wire value: `bacs`.
   */
  public data object Bacs : InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234() {
    public override val `value`: String = "bacs"
  }

  /**
   * Documented value. Wire value: `domestic_wire_us`.
   */
  public data object DomesticWireUs : InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234() {
    public override val `value`: String = "domestic_wire_us"
  }

  /**
   * Documented value. Wire value: `fps`.
   */
  public data object Fps : InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234() {
    public override val `value`: String = "fps"
  }

  /**
   * Documented value. Wire value: `sepa`.
   */
  public data object Sepa : InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234() {
    public override val `value`: String = "sepa"
  }

  /**
   * Documented value. Wire value: `spei`.
   */
  public data object Spei : InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234() {
    public override val `value`: String = "spei"
  }

  /**
   * Documented value. Wire value: `swift`.
   */
  public data object Swift : InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234() {
    public override val `value`: String = "swift"
  }

  /**
   * Documented value. Wire value: `zengin`.
   */
  public data object Zengin : InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234() {
    public override val `value`: String = "zengin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234()

  public companion object {
    public fun fromValue(`value`: String): InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234 = when (value) {
      Ach.value -> Ach
      Bacs.value -> Bacs
      DomesticWireUs.value -> DomesticWireUs
      Fps.value -> Fps
      Sepa.value -> Sepa
      Spei.value -> Spei
      Swift.value -> Swift
      Zengin.value -> Zengin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFundingInstructionsBab6cSupportedNetworksItemXc6d5f234) {
      encoder.encodeString(value.value)
    }
  }
}
