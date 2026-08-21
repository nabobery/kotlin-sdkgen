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
 * The UI mode of the Session. Defaults to `hosted_page`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/ui_mode
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormUiModeXafa2252d.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormUiModeXafa2252d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `elements`.
   */
  public data object Elements : InlineV1CheckoutSessionsPostRequestFormUiModeXafa2252d() {
    public override val `value`: String = "elements"
  }

  /**
   * Documented value. Wire value: `embedded_page`.
   */
  public data object EmbeddedPage : InlineV1CheckoutSessionsPostRequestFormUiModeXafa2252d() {
    public override val `value`: String = "embedded_page"
  }

  /**
   * Documented value. Wire value: `hosted_page`.
   */
  public data object HostedPage : InlineV1CheckoutSessionsPostRequestFormUiModeXafa2252d() {
    public override val `value`: String = "hosted_page"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormUiModeXafa2252d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormUiModeXafa2252d = when (value) {
      Elements.value -> Elements
      EmbeddedPage.value -> EmbeddedPage
      HostedPage.value -> HostedPage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormUiModeXafa2252d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormUiModeXafa2252d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormUiModeXafa2252d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormUiModeXafa2252d) {
      encoder.encodeString(value.value)
    }
  }
}
