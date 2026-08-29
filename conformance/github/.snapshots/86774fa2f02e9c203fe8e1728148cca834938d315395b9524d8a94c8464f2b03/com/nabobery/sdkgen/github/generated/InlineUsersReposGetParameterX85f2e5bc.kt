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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1repos/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1repos/get/parameters/3/schema
 */
@Serializable(with = InlineUsersReposGetParameterX85f2e5bc.Serializer::class)
public sealed class InlineUsersReposGetParameterX85f2e5bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlineUsersReposGetParameterX85f2e5bc() {
    public override val `value`: String = "asc"
  }

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlineUsersReposGetParameterX85f2e5bc() {
    public override val `value`: String = "desc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersReposGetParameterX85f2e5bc()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersReposGetParameterX85f2e5bc = when (value) {
      Asc.value -> Asc
      Desc.value -> Desc
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersReposGetParameterX85f2e5bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUsersReposGetParameterX85f2e5bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersReposGetParameterX85f2e5bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersReposGetParameterX85f2e5bc) {
      encoder.encodeString(value.value)
    }
  }
}
