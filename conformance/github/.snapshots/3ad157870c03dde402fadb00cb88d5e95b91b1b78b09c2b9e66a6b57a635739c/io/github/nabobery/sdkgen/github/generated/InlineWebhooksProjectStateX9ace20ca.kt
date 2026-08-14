package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * State of the project; either 'open' or 'closed'
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_project/properties/state
 */
@Serializable(with = InlineWebhooksProjectStateX9ace20ca.Serializer::class)
public sealed class InlineWebhooksProjectStateX9ace20ca {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksProjectStateX9ace20ca() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhooksProjectStateX9ace20ca() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksProjectStateX9ace20ca()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksProjectStateX9ace20ca = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksProjectStateX9ace20ca> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksProjectStateX9ace20ca", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksProjectStateX9ace20ca = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksProjectStateX9ace20ca) {
      encoder.encodeString(value.value)
    }
  }
}
