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
 * Filter by distillation capability. "true" returns only distillable models, "false" excludes them.
 */
@Serializable(with = InlinePathsModelsGetParameters14Schema.Serializer::class)
public sealed class InlinePathsModelsGetParameters14Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `true`.
   */
  public data object TrueValue : InlinePathsModelsGetParameters14Schema() {
    public override val `value`: String = "true"
  }

  /**
   * Documented value. Wire value: `false`.
   */
  public data object FalseValue : InlinePathsModelsGetParameters14Schema() {
    public override val `value`: String = "false"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsModelsGetParameters14Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsModelsGetParameters14Schema = when (value) {
      TrueValue.value -> TrueValue
      FalseValue.value -> FalseValue
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsModelsGetParameters14Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsModelsGetParameters14Schema", PrimitiveKind
          .STRING)

    override fun deserialize(decoder: Decoder): InlinePathsModelsGetParameters14Schema = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsModelsGetParameters14Schema) {
      encoder.encodeString(value.value)
    }
  }
}
