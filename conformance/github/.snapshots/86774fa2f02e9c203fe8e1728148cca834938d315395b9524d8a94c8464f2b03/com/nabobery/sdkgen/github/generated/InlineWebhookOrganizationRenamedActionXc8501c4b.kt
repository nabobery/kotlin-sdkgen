package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-renamed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-renamed/properties/action
 */
@Serializable(with = InlineWebhookOrganizationRenamedActionXc8501c4b.Serializer::class)
public sealed class InlineWebhookOrganizationRenamedActionXc8501c4b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `renamed`.
   */
  public data object Renamed : InlineWebhookOrganizationRenamedActionXc8501c4b() {
    public override val `value`: String = "renamed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookOrganizationRenamedActionXc8501c4b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookOrganizationRenamedActionXc8501c4b = when (value) {
      Renamed.value -> Renamed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookOrganizationRenamedActionXc8501c4b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookOrganizationRenamedActionXc8501c4b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookOrganizationRenamedActionXc8501c4b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookOrganizationRenamedActionXc8501c4b) {
      encoder.encodeString(value.value)
    }
  }
}
