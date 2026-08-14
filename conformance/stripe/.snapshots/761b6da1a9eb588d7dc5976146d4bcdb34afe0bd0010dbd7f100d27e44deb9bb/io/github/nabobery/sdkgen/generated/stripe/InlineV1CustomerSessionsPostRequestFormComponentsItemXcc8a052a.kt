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
 * ed/schema/properties/components/properties/mobile_payment_element/properties/features/properties/payment_method_allow
 * _redisplay_filters/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/components/properties/mobile_payment_element/properties/features/properties/payment_method_allow
 * _redisplay_filters/items
 */
@Serializable(with = InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a.Serializer::class)
public sealed class InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomerSessionsPostRequestFormComponentsItemXcc8a052a) {
      encoder.encodeString(value.value)
    }
  }
}
