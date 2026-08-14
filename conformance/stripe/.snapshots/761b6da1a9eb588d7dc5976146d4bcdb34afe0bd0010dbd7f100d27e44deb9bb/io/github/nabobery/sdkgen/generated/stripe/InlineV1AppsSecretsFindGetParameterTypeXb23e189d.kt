package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets~1find/get/parameters/2/schema/properties/type.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets~1find/get/parameters/2/schema/properties/type
 */
@Serializable(with = InlineV1AppsSecretsFindGetParameterTypeXb23e189d.Serializer::class)
public sealed class InlineV1AppsSecretsFindGetParameterTypeXb23e189d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineV1AppsSecretsFindGetParameterTypeXb23e189d() {
    public override val `value`: String = "account"
  }

  /**
   * Documented value. Wire value: `user`.
   */
  public data object User : InlineV1AppsSecretsFindGetParameterTypeXb23e189d() {
    public override val `value`: String = "user"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AppsSecretsFindGetParameterTypeXb23e189d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AppsSecretsFindGetParameterTypeXb23e189d = when (value) {
      Account.value -> Account
      User.value -> User
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AppsSecretsFindGetParameterTypeXb23e189d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1AppsSecretsFindGetParameterTypeXb23e189d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AppsSecretsFindGetParameterTypeXb23e189d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AppsSecretsFindGetParameterTypeXb23e189d) {
      encoder.encodeString(value.value)
    }
  }
}
