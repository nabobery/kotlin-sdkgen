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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1repos/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1repos/get/parameters/2/schema
 */
@Serializable(with = InlineUsersReposGetParameterX6a23895f.Serializer::class)
public sealed class InlineUsersReposGetParameterX6a23895f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineUsersReposGetParameterX6a23895f() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineUsersReposGetParameterX6a23895f() {
    public override val `value`: String = "updated"
  }

  /**
   * Documented value. Wire value: `pushed`.
   */
  public data object Pushed : InlineUsersReposGetParameterX6a23895f() {
    public override val `value`: String = "pushed"
  }

  /**
   * Documented value. Wire value: `full_name`.
   */
  public data object FullName : InlineUsersReposGetParameterX6a23895f() {
    public override val `value`: String = "full_name"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersReposGetParameterX6a23895f()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersReposGetParameterX6a23895f = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      Pushed.value -> Pushed
      FullName.value -> FullName
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsersReposGetParameterX6a23895f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineUsersReposGetParameterX6a23895f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersReposGetParameterX6a23895f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersReposGetParameterX6a23895f) {
      encoder.encodeString(value.value)
    }
  }
}
