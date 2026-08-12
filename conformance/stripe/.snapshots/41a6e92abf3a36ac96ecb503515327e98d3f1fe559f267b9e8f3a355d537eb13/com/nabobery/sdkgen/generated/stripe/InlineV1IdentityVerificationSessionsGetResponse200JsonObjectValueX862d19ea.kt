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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/get/responses/200/content/application~1json
 * /schema/properties/object
 */
@Serializable(with = InlineV1IdentityVerificationSessionsGetResponse200JsonObjectValueX862d19ea.Serializer::class)
public sealed class InlineV1IdentityVerificationSessionsGetResponse200JsonObjectValueX862d19ea {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1IdentityVerificationSessionsGetResponse200JsonObjectValueX862d19ea() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IdentityVerificationSessionsGetResponse200JsonObjectValueX862d19ea()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IdentityVerificationSessionsGetResponse200JsonObjectValueX862d19ea = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IdentityVerificationSessionsGetResponse200JsonObjectValueX862d19ea> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificationSessionsGetResponse200JsonObjectValueX862d19ea", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IdentityVerificationSessionsGetResponse200JsonObjectValueX862d19ea = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IdentityVerificationSessionsGetResponse200JsonObjectValueX862d19ea) {
      encoder.encodeString(value.value)
    }
  }
}
