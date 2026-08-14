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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1user~1repos/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1repos/get/parameters/2/schema
 */
@Serializable(with = InlineUserReposGetParameterX7c9c639e.Serializer::class)
public sealed class InlineUserReposGetParameterX7c9c639e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineUserReposGetParameterX7c9c639e() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `owner`.
   */
  public data object Owner : InlineUserReposGetParameterX7c9c639e() {
    public override val `value`: String = "owner"
  }

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineUserReposGetParameterX7c9c639e() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineUserReposGetParameterX7c9c639e() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineUserReposGetParameterX7c9c639e() {
    public override val `value`: String = "member"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserReposGetParameterX7c9c639e()

  public companion object {
    public fun fromValue(`value`: String): InlineUserReposGetParameterX7c9c639e = when (value) {
      All.value -> All
      Owner.value -> Owner
      Public.value -> Public
      Private.value -> Private
      Member.value -> Member
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUserReposGetParameterX7c9c639e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineUserReposGetParameterX7c9c639e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserReposGetParameterX7c9c639e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserReposGetParameterX7c9c639e) {
      encoder.encodeString(value.value)
    }
  }
}
