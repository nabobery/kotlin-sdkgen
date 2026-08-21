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
 * The Electronic Commerce Indicator (ECI). A protocol-level field
 * indicating what degree of authentication was performed.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/three_d_secure_details/properties/electronic_commerce_indicator
 */
@Serializable(with = InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0.Serializer::class)
public sealed class InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `01`.
   */
  public data object _01 : InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0() {
    public override val `value`: String = "01"
  }

  /**
   * Documented value. Wire value: `02`.
   */
  public data object _02 : InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0() {
    public override val `value`: String = "02"
  }

  /**
   * Documented value. Wire value: `05`.
   */
  public data object _05 : InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0() {
    public override val `value`: String = "05"
  }

  /**
   * Documented value. Wire value: `06`.
   */
  public data object _06 : InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0() {
    public override val `value`: String = "06"
  }

  /**
   * Documented value. Wire value: `07`.
   */
  public data object _07 : InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0() {
    public override val `value`: String = "07"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0()

  public companion object {
    public fun fromValue(`value`: String): InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0 = when (value) {
      _01.value -> _01
      _02.value -> _02
      _05.value -> _05
      _06.value -> _06
      _07.value -> _07
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineThreeDSecureDetailsElectronicCommerceIndicatorX3d6885c0) {
      encoder.encodeString(value.value)
    }
  }
}
