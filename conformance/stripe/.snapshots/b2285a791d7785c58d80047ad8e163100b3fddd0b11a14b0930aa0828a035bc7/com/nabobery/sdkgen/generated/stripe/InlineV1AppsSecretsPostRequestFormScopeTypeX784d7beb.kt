package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/scope/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/scope/properties/type
 */
@Serializable(with = InlineV1AppsSecretsPostRequestFormScopeTypeX784d7beb.Serializer::class)
public sealed class InlineV1AppsSecretsPostRequestFormScopeTypeX784d7beb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineV1AppsSecretsPostRequestFormScopeTypeX784d7beb() {
    public override val `value`: String = "account"
  }

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineV1AppsSecretsPostRequestFormScopeTypeX784d7beb() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AppsSecretsPostRequestFormScopeTypeX784d7beb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AppsSecretsPostRequestFormScopeTypeX784d7beb = when (value) {
      Account.value -> Account
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1AppsSecretsPostRequestFormScopeTypeX784d7beb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AppsSecretsPostRequestFormScopeTypeX784d7beb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AppsSecretsPostRequestFormScopeTypeX784d7beb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AppsSecretsPostRequestFormScopeTypeX784d7beb) {
      encoder.encodeString(value.value)
    }
  }
}
