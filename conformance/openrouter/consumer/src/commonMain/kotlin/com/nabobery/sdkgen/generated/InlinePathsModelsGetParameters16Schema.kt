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
 * Filter to models with endpoints in the given data region. Currently only "eu" is supported.
 */
@Serializable(with = InlinePathsModelsGetParameters16Schema.Serializer::class)
public sealed class InlinePathsModelsGetParameters16Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `eu`.
   */
  public data object Eu : InlinePathsModelsGetParameters16Schema() {
    public override val `value`: String = "eu"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsModelsGetParameters16Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsModelsGetParameters16Schema = when (value) {
      Eu.value -> Eu
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsModelsGetParameters16Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsModelsGetParameters16Schema", PrimitiveKind
          .STRING)

    override fun deserialize(decoder: Decoder): InlinePathsModelsGetParameters16Schema = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsModelsGetParameters16Schema) {
      encoder.encodeString(value.value)
    }
  }
}
