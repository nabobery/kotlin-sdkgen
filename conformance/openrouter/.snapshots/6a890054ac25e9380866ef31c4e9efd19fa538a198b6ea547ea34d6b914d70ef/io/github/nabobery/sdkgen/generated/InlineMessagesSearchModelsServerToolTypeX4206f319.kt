package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesSearchModelsServerTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesSearchModelsServerTool/properties/type
 */
@Serializable(with = InlineMessagesSearchModelsServerToolTypeX4206f319.Serializer::class)
public sealed class InlineMessagesSearchModelsServerToolTypeX4206f319 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:experimental__search_models`.
   */
  public data object OpenrouterExperimentalSearchModels : InlineMessagesSearchModelsServerToolTypeX4206f319() {
    public override val `value`: String = "openrouter:experimental__search_models"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesSearchModelsServerToolTypeX4206f319()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesSearchModelsServerToolTypeX4206f319 = when (value) {
      OpenrouterExperimentalSearchModels.value -> OpenrouterExperimentalSearchModels
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesSearchModelsServerToolTypeX4206f319> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesSearchModelsServerToolTypeX4206f319", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesSearchModelsServerToolTypeX4206f319 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesSearchModelsServerToolTypeX4206f319) {
      encoder.encodeString(value.value)
    }
  }
}
