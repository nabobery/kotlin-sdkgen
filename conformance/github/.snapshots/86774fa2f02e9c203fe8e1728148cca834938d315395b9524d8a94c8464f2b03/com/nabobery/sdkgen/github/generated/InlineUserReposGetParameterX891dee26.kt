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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1user~1repos/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1repos/get/parameters/4/schema
 */
@Serializable(with = InlineUserReposGetParameterX891dee26.Serializer::class)
public sealed class InlineUserReposGetParameterX891dee26 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlineUserReposGetParameterX891dee26() {
    public override val `value`: String = "asc"
  }

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlineUserReposGetParameterX891dee26() {
    public override val `value`: String = "desc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserReposGetParameterX891dee26()

  public companion object {
    public fun fromValue(`value`: String): InlineUserReposGetParameterX891dee26 = when (value) {
      Asc.value -> Asc
      Desc.value -> Desc
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUserReposGetParameterX891dee26> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserReposGetParameterX891dee26", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserReposGetParameterX891dee26 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserReposGetParameterX891dee26) {
      encoder.encodeString(value.value)
    }
  }
}
