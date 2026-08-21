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
 * The type of search that was performed. Possible values are `lexical`, `semantic`, or `hybrid`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1search~1issues/get/responses/200/content/application~1json/schema/properties/se
 * arch_type
 */
@Serializable(with = InlineSearchIssuesGetResponse200JsonSearchTypeX54752d3c.Serializer::class)
public sealed class InlineSearchIssuesGetResponse200JsonSearchTypeX54752d3c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `lexical`.
   */
  public data object Lexical : InlineSearchIssuesGetResponse200JsonSearchTypeX54752d3c() {
    public override val `value`: String = "lexical"
  }

  /**
   * Documented value. Wire value: `semantic`.
   */
  public data object Semantic : InlineSearchIssuesGetResponse200JsonSearchTypeX54752d3c() {
    public override val `value`: String = "semantic"
  }

  /**
   * Documented value. Wire value: `hybrid`.
   */
  public data object Hybrid : InlineSearchIssuesGetResponse200JsonSearchTypeX54752d3c() {
    public override val `value`: String = "hybrid"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSearchIssuesGetResponse200JsonSearchTypeX54752d3c()

  public companion object {
    public fun fromValue(`value`: String): InlineSearchIssuesGetResponse200JsonSearchTypeX54752d3c = when (value) {
      Lexical.value -> Lexical
      Semantic.value -> Semantic
      Hybrid.value -> Hybrid
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSearchIssuesGetResponse200JsonSearchTypeX54752d3c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSearchIssuesGetResponse200JsonSearchTypeX54752d3c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSearchIssuesGetResponse200JsonSearchTypeX54752d3c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSearchIssuesGetResponse200JsonSearchTypeX54752d3c) {
      encoder.encodeString(value.value)
    }
  }
}
