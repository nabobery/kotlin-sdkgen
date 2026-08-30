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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1search~1users/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1search~1users/get/parameters/1/schema
 */
@Serializable(with = InlineSearchUsersGetParameterXb95f88ed.Serializer::class)
public sealed class InlineSearchUsersGetParameterXb95f88ed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `followers`.
   */
  public data object Followers : InlineSearchUsersGetParameterXb95f88ed() {
    public override val `value`: String = "followers"
  }

  /**
   * Documented value. Wire value: `repositories`.
   */
  public data object Repositories : InlineSearchUsersGetParameterXb95f88ed() {
    public override val `value`: String = "repositories"
  }

  /**
   * Documented value. Wire value: `joined`.
   */
  public data object Joined : InlineSearchUsersGetParameterXb95f88ed() {
    public override val `value`: String = "joined"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSearchUsersGetParameterXb95f88ed()

  public companion object {
    public fun fromValue(`value`: String): InlineSearchUsersGetParameterXb95f88ed = when (value) {
      Followers.value -> Followers
      Repositories.value -> Repositories
      Joined.value -> Joined
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSearchUsersGetParameterXb95f88ed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSearchUsersGetParameterXb95f88ed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSearchUsersGetParameterXb95f88ed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSearchUsersGetParameterXb95f88ed) {
      encoder.encodeString(value.value)
    }
  }
}
