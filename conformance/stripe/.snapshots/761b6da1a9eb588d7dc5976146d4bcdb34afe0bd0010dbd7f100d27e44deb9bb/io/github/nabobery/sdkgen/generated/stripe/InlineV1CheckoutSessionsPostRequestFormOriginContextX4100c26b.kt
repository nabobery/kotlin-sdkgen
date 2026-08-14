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
 * Where the user is coming from. This informs the optimizations that are applied to the session. You can't set this
 * parameter if `ui_mode` is `elements`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/origin_context
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormOriginContextX4100c26b.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormOriginContextX4100c26b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mobile_app`.
   */
  public data object MobileApp : InlineV1CheckoutSessionsPostRequestFormOriginContextX4100c26b() {
    public override val `value`: String = "mobile_app"
  }

  /**
   * Documented value. Wire value: `web`.
   */
  public data object Web : InlineV1CheckoutSessionsPostRequestFormOriginContextX4100c26b() {
    public override val `value`: String = "web"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormOriginContextX4100c26b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormOriginContextX4100c26b = when (value) {
      MobileApp.value -> MobileApp
      Web.value -> Web
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormOriginContextX4100c26b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormOriginContextX4100c26b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormOriginContextX4100c26b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormOriginContextX4100c26b) {
      encoder.encodeString(value.value)
    }
  }
}
