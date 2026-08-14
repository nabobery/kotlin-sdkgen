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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/personal-access-token-sort/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/personal-access-token-sort/schema
 */
@Serializable(with = InlinePersonalAccessTokenSortParameterXb7b3a03e.Serializer::class)
public sealed class InlinePersonalAccessTokenSortParameterXb7b3a03e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created_at`.
   */
  public data object CreatedAt : InlinePersonalAccessTokenSortParameterXb7b3a03e() {
    public override val `value`: String = "created_at"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePersonalAccessTokenSortParameterXb7b3a03e()

  public companion object {
    public fun fromValue(`value`: String): InlinePersonalAccessTokenSortParameterXb7b3a03e = when (value) {
      CreatedAt.value -> CreatedAt
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePersonalAccessTokenSortParameterXb7b3a03e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlinePersonalAccessTokenSortParameterXb7b3a03e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePersonalAccessTokenSortParameterXb7b3a03e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePersonalAccessTokenSortParameterXb7b3a03e) {
      encoder.encodeString(value.value)
    }
  }
}
