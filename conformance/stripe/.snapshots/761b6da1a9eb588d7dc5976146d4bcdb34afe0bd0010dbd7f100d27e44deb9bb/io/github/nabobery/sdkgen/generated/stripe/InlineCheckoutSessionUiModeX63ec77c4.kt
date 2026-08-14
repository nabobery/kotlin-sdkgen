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
 * The UI mode of the Session. Defaults to `hosted_page`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/ui_mode
 */
@Serializable(with = InlineCheckoutSessionUiModeX63ec77c4.Serializer::class)
public sealed class InlineCheckoutSessionUiModeX63ec77c4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `elements`.
   */
  public data object Elements : InlineCheckoutSessionUiModeX63ec77c4() {
    public override val `value`: String = "elements"
  }

  /**
   * Documented value. Wire value: `embedded_page`.
   */
  public data object EmbeddedPage : InlineCheckoutSessionUiModeX63ec77c4() {
    public override val `value`: String = "embedded_page"
  }

  /**
   * Documented value. Wire value: `hosted_page`.
   */
  public data object HostedPage : InlineCheckoutSessionUiModeX63ec77c4() {
    public override val `value`: String = "hosted_page"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutSessionUiModeX63ec77c4()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutSessionUiModeX63ec77c4 = when (value) {
      Elements.value -> Elements
      EmbeddedPage.value -> EmbeddedPage
      HostedPage.value -> HostedPage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutSessionUiModeX63ec77c4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCheckoutSessionUiModeX63ec77c4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionUiModeX63ec77c4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionUiModeX63ec77c4) {
      encoder.encodeString(value.value)
    }
  }
}
