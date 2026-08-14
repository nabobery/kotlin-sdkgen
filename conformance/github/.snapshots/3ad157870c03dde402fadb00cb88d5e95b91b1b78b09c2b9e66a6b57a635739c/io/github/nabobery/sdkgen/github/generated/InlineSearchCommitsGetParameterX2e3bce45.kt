package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1search~1commits/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1search~1commits/get/parameters/1/schema
 */
@Serializable(with = InlineSearchCommitsGetParameterX2e3bce45.Serializer::class)
public sealed class InlineSearchCommitsGetParameterX2e3bce45 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `author-date`.
   */
  public data object AuthorDate : InlineSearchCommitsGetParameterX2e3bce45() {
    public override val `value`: String = "author-date"
  }

  /**
   * Documented value. Wire value: `committer-date`.
   */
  public data object CommitterDate : InlineSearchCommitsGetParameterX2e3bce45() {
    public override val `value`: String = "committer-date"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSearchCommitsGetParameterX2e3bce45()

  public companion object {
    public fun fromValue(`value`: String): InlineSearchCommitsGetParameterX2e3bce45 = when (value) {
      AuthorDate.value -> AuthorDate
      CommitterDate.value -> CommitterDate
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSearchCommitsGetParameterX2e3bce45> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineSearchCommitsGetParameterX2e3bce45", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSearchCommitsGetParameterX2e3bce45 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSearchCommitsGetParameterX2e3bce45) {
      encoder.encodeString(value.value)
    }
  }
}
