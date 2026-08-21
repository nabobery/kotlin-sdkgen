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
 * Source: sdkgen://source/openapi.json#/components/schemas/three_d_secure_details_charge/properties/result_reason
 */
@Serializable(with = InlineThreeDSecureDetailsChargeResultReasonX694e3302.Serializer::class)
public sealed class InlineThreeDSecureDetailsChargeResultReasonX694e3302 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `abandoned`.
   */
  public data object Abandoned : InlineThreeDSecureDetailsChargeResultReasonX694e3302() {
    public override val `value`: String = "abandoned"
  }

  /**
   * Documented value. Wire value: `bypassed`.
   */
  public data object Bypassed : InlineThreeDSecureDetailsChargeResultReasonX694e3302() {
    public override val `value`: String = "bypassed"
  }

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineThreeDSecureDetailsChargeResultReasonX694e3302() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `card_not_enrolled`.
   */
  public data object CardNotEnrolled : InlineThreeDSecureDetailsChargeResultReasonX694e3302() {
    public override val `value`: String = "card_not_enrolled"
  }

  /**
   * Documented value. Wire value: `network_not_supported`.
   */
  public data object NetworkNotSupported : InlineThreeDSecureDetailsChargeResultReasonX694e3302() {
    public override val `value`: String = "network_not_supported"
  }

  /**
   * Documented value. Wire value: `protocol_error`.
   */
  public data object ProtocolError : InlineThreeDSecureDetailsChargeResultReasonX694e3302() {
    public override val `value`: String = "protocol_error"
  }

  /**
   * Documented value. Wire value: `rejected`.
   */
  public data object Rejected : InlineThreeDSecureDetailsChargeResultReasonX694e3302() {
    public override val `value`: String = "rejected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineThreeDSecureDetailsChargeResultReasonX694e3302()

  public companion object {
    public fun fromValue(`value`: String): InlineThreeDSecureDetailsChargeResultReasonX694e3302 = when (value) {
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

  internal object Serializer : KSerializer<InlineThreeDSecureDetailsChargeResultReasonX694e3302> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineThreeDSecureDetailsChargeResultReasonX694e3302", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineThreeDSecureDetailsChargeResultReasonX694e3302 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineThreeDSecureDetailsChargeResultReasonX694e3302) {
      encoder.encodeString(value.value)
    }
  }
}
