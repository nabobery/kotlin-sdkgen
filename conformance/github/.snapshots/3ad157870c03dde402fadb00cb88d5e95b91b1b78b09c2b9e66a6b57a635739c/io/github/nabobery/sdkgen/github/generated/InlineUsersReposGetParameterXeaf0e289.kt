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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1repos/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1repos/get/parameters/1/schema
 */
@Serializable(with = InlineUsersReposGetParameterXeaf0e289.Serializer::class)
public sealed class InlineUsersReposGetParameterXeaf0e289 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineUsersReposGetParameterXeaf0e289() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `owner`.
   */
  public data object Owner : InlineUsersReposGetParameterXeaf0e289() {
    public override val `value`: String = "owner"
  }

  /**
   * Documented value. Wire value: `member`.
   */
  public data object Member : InlineUsersReposGetParameterXeaf0e289() {
    public override val `value`: String = "member"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersReposGetParameterXeaf0e289()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersReposGetParameterXeaf0e289 = when (value) {
      All.value -> All
      Owner.value -> Owner
      Member.value -> Member
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersReposGetParameterXeaf0e289> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineUsersReposGetParameterXeaf0e289", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersReposGetParameterXeaf0e289 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersReposGetParameterXeaf0e289) {
      encoder.encodeString(value.value)
    }
  }
}
