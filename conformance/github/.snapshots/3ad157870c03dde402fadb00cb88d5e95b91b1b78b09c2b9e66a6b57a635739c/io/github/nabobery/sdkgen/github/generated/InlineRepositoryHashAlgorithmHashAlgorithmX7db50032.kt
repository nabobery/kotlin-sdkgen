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
 * The Git hash algorithm used by this repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-hash-algorithm/properties/hash_algorithm
 */
@Serializable(with = InlineRepositoryHashAlgorithmHashAlgorithmX7db50032.Serializer::class)
public sealed class InlineRepositoryHashAlgorithmHashAlgorithmX7db50032 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `sha1`.
   */
  public data object Sha1 : InlineRepositoryHashAlgorithmHashAlgorithmX7db50032() {
    public override val `value`: String = "sha1"
  }

  /**
   * Documented value. Wire value: `sha256`.
   */
  public data object Sha256 : InlineRepositoryHashAlgorithmHashAlgorithmX7db50032() {
    public override val `value`: String = "sha256"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryHashAlgorithmHashAlgorithmX7db50032()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryHashAlgorithmHashAlgorithmX7db50032 = when (value) {
      Sha1.value -> Sha1
      Sha256.value -> Sha256
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryHashAlgorithmHashAlgorithmX7db50032> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryHashAlgorithmHashAlgorithmX7db50032", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryHashAlgorithmHashAlgorithmX7db50032 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryHashAlgorithmHashAlgorithmX7db50032) {
      encoder.encodeString(value.value)
    }
  }
}
