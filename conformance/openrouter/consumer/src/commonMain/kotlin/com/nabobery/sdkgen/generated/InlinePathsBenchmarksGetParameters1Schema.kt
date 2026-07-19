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
 * Filter results by task type. For Artificial Analysis, maps to the corresponding index. For Design Arena, maps to the
 * matching category.
 */
@Serializable(with = InlinePathsBenchmarksGetParameters1Schema.Serializer::class)
public sealed class InlinePathsBenchmarksGetParameters1Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `coding`.
   */
  public data object Coding : InlinePathsBenchmarksGetParameters1Schema() {
    public override val `value`: String = "coding"
  }

  /**
   * Documented value. Wire value: `intelligence`.
   */
  public data object Intelligence : InlinePathsBenchmarksGetParameters1Schema() {
    public override val `value`: String = "intelligence"
  }

  /**
   * Documented value. Wire value: `agentic`.
   */
  public data object Agentic : InlinePathsBenchmarksGetParameters1Schema() {
    public override val `value`: String = "agentic"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsBenchmarksGetParameters1Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsBenchmarksGetParameters1Schema = when (value) {
      Coding.value -> Coding
      Intelligence.value -> Intelligence
      Agentic.value -> Agentic
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsBenchmarksGetParameters1Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsBenchmarksGetParameters1Schema",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsBenchmarksGetParameters1Schema = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsBenchmarksGetParameters1Schema) {
      encoder.encodeString(value.value)
    }
  }
}
