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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-closed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-closed/properties/action
 */
@Serializable(with = InlineWebhookProjectsV2ProjectClosedActionX6296d1eb.Serializer::class)
public sealed class InlineWebhookProjectsV2ProjectClosedActionX6296d1eb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookProjectsV2ProjectClosedActionX6296d1eb() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookProjectsV2ProjectClosedActionX6296d1eb()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookProjectsV2ProjectClosedActionX6296d1eb = when (value) {
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2ProjectClosedActionX6296d1eb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookProjectsV2ProjectClosedActionX6296d1eb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ProjectClosedActionX6296d1eb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ProjectClosedActionX6296d1eb) {
      encoder.encodeString(value.value)
    }
  }
}
