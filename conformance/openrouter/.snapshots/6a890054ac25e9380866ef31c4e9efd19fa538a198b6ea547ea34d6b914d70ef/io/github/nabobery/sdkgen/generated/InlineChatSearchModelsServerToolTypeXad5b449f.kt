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
 * sdkgen://source/openapi.yaml#/components/schemas/ChatSearchModelsServerTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatSearchModelsServerTool/properties/type
 */
@Serializable(with = InlineChatSearchModelsServerToolTypeXad5b449f.Serializer::class)
public sealed class InlineChatSearchModelsServerToolTypeXad5b449f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:experimental__search_models`.
   */
  public data object OpenrouterExperimentalSearchModels : InlineChatSearchModelsServerToolTypeXad5b449f() {
    public override val `value`: String = "openrouter:experimental__search_models"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatSearchModelsServerToolTypeXad5b449f()

  public companion object {
    public fun fromValue(`value`: String): InlineChatSearchModelsServerToolTypeXad5b449f = when (value) {
      OpenrouterExperimentalSearchModels.value -> OpenrouterExperimentalSearchModels
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatSearchModelsServerToolTypeXad5b449f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineChatSearchModelsServerToolTypeXad5b449f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatSearchModelsServerToolTypeXad5b449f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatSearchModelsServerToolTypeXad5b449f) {
      encoder.encodeString(value.value)
    }
  }
}
