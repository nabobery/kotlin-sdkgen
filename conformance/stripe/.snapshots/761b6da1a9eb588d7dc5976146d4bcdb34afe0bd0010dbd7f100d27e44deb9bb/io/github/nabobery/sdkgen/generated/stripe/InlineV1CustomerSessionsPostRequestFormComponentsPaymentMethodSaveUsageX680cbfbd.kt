package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/payment_element/properties/features/properties/payment_method_save_usage.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/payment_element/properties/features/properties/payment_method_save_usage
 */
@Serializable(with = InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveUsageX680cbfbd.Serializer::class)
public sealed class InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveUsageX680cbfbd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off_session`.
   */
  public data object OffSession : InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveUsageX680cbfbd() {
    public override val `value`: String = "off_session"
  }

  /**
   * Documented value. Wire value: `on_session`.
   */
  public data object OnSession : InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveUsageX680cbfbd() {
    public override val `value`: String = "on_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveUsageX680cbfbd()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveUsageX680cbfbd = when (value) {
      OffSession.value -> OffSession
      OnSession.value -> OnSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveUsageX680cbfbd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveUsageX680cbfbd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveUsageX680cbfbd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomerSessionsPostRequestFormComponentsPaymentMethodSaveUsageX680cbfbd) {
      encoder.encodeString(value.value)
    }
  }
}
