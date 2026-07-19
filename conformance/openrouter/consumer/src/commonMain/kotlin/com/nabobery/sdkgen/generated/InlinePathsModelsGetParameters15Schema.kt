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
 * When set to "true", return only models with zero data retention endpoints.
 */
@Serializable(with = InlinePathsModelsGetParameters15Schema.Serializer::class)
public sealed class InlinePathsModelsGetParameters15Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `true`.
   */
  public data object TrueValue : InlinePathsModelsGetParameters15Schema() {
    public override val `value`: String = "true"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsModelsGetParameters15Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsModelsGetParameters15Schema = when (value) {
      TrueValue.value -> TrueValue
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsModelsGetParameters15Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsModelsGetParameters15Schema", PrimitiveKind
          .STRING)

    override fun deserialize(decoder: Decoder): InlinePathsModelsGetParameters15Schema = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsModelsGetParameters15Schema) {
      encoder.encodeString(value.value)
    }
  }
}
