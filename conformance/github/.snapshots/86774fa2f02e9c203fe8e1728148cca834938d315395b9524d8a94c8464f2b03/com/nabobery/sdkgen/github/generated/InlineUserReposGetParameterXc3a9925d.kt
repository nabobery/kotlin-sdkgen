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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1user~1repos/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1repos/get/parameters/0/schema
 */
@Serializable(with = InlineUserReposGetParameterXc3a9925d.Serializer::class)
public sealed class InlineUserReposGetParameterXc3a9925d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineUserReposGetParameterXc3a9925d() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineUserReposGetParameterXc3a9925d() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineUserReposGetParameterXc3a9925d() {
    public override val `value`: String = "private"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserReposGetParameterXc3a9925d()

  public companion object {
    public fun fromValue(`value`: String): InlineUserReposGetParameterXc3a9925d = when (value) {
      All.value -> All
      Public.value -> Public
      Private.value -> Private
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUserReposGetParameterXc3a9925d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserReposGetParameterXc3a9925d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserReposGetParameterXc3a9925d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserReposGetParameterXc3a9925d) {
      encoder.encodeString(value.value)
    }
  }
}
