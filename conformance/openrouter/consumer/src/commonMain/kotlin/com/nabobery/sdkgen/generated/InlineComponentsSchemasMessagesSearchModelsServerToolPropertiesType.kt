package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = InlineComponentsSchemasMessagesSearchModelsServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasMessagesSearchModelsServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:experimental__search_models`.
   */
  public data object OpenrouterExperimentalSearchModels : InlineComponentsSchemasMessagesSearchModelsServerToolPropertiesType() {
    public override val `value`: String = "openrouter:experimental__search_models"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasMessagesSearchModelsServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasMessagesSearchModelsServerToolPropertiesType =
      when (value) {
      OpenrouterExperimentalSearchModels.value -> OpenrouterExperimentalSearchModels
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesSearchModelsServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasMessagesSearchModelsServerToolPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesSearchModelsServerToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesSearchModelsServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
