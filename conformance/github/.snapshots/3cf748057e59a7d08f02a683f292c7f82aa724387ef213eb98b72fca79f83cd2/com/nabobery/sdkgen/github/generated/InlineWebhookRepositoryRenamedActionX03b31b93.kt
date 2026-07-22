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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-renamed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-renamed/properties/action
 */
@Serializable(with = InlineWebhookRepositoryRenamedActionX03b31b93.Serializer::class)
public sealed class InlineWebhookRepositoryRenamedActionX03b31b93 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `renamed`.
   */
  public data object Renamed : InlineWebhookRepositoryRenamedActionX03b31b93() {
    public override val `value`: String = "renamed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookRepositoryRenamedActionX03b31b93()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookRepositoryRenamedActionX03b31b93 = when (value) {
      Renamed.value -> Renamed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryRenamedActionX03b31b93> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookRepositoryRenamedActionX03b31b93", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryRenamedActionX03b31b93 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryRenamedActionX03b31b93) {
      encoder.encodeString(value.value)
    }
  }
}
