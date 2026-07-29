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
 * Additional information about why 3D Secure succeeded or failed based
 * on the `result`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/three_d_secure_details/properties/result_reason
 */
@Serializable(with = InlineThreeDSecureDetailsResultReasonX97352a26.Serializer::class)
public sealed class InlineThreeDSecureDetailsResultReasonX97352a26 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `abandoned`.
   */
  public data object Abandoned : InlineThreeDSecureDetailsResultReasonX97352a26() {
    public override val `value`: String = "abandoned"
  }

  /**
   * Documented value. Wire value: `bypassed`.
   */
  public data object Bypassed : InlineThreeDSecureDetailsResultReasonX97352a26() {
    public override val `value`: String = "bypassed"
  }

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineThreeDSecureDetailsResultReasonX97352a26() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `card_not_enrolled`.
   */
  public data object CardNotEnrolled : InlineThreeDSecureDetailsResultReasonX97352a26() {
    public override val `value`: String = "card_not_enrolled"
  }

  /**
   * Documented value. Wire value: `network_not_supported`.
   */
  public data object NetworkNotSupported : InlineThreeDSecureDetailsResultReasonX97352a26() {
    public override val `value`: String = "network_not_supported"
  }

  /**
   * Documented value. Wire value: `protocol_error`.
   */
  public data object ProtocolError : InlineThreeDSecureDetailsResultReasonX97352a26() {
    public override val `value`: String = "protocol_error"
  }

  /**
   * Documented value. Wire value: `rejected`.
   */
  public data object Rejected : InlineThreeDSecureDetailsResultReasonX97352a26() {
    public override val `value`: String = "rejected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineThreeDSecureDetailsResultReasonX97352a26()

  public companion object {
    public fun fromValue(`value`: String): InlineThreeDSecureDetailsResultReasonX97352a26 = when (value) {
      Abandoned.value -> Abandoned
      Bypassed.value -> Bypassed
      Canceled.value -> Canceled
      CardNotEnrolled.value -> CardNotEnrolled
      NetworkNotSupported.value -> NetworkNotSupported
      ProtocolError.value -> ProtocolError
      Rejected.value -> Rejected
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineThreeDSecureDetailsResultReasonX97352a26> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineThreeDSecureDetailsResultReasonX97352a26", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineThreeDSecureDetailsResultReasonX97352a26 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineThreeDSecureDetailsResultReasonX97352a26) {
      encoder.encodeString(value.value)
    }
  }
}
