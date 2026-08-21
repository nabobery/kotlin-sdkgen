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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-team-edited/properties/action
 */
@Serializable(with = InlineWebhookTeamEditedActionXb8760449.Serializer::class)
public sealed class InlineWebhookTeamEditedActionXb8760449 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `edited`.
   */
  public data object Edited : InlineWebhookTeamEditedActionXb8760449() {
    public override val `value`: String = "edited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookTeamEditedActionXb8760449()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookTeamEditedActionXb8760449 = when (value) {
      Edited.value -> Edited
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookTeamEditedActionXb8760449> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookTeamEditedActionXb8760449", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookTeamEditedActionXb8760449 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookTeamEditedActionXb8760449) {
      encoder.encodeString(value.value)
    }
  }
}
