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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.authorization/properties/object
 */
@Serializable(with = InlineIssuingAuthorizationObjectValueX65b3194f.Serializer::class)
public sealed class InlineIssuingAuthorizationObjectValueX65b3194f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `issuing.authorization`.
   */
  public data object IssuingAuthorization : InlineIssuingAuthorizationObjectValueX65b3194f() {
    public override val `value`: String = "issuing.authorization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingAuthorizationObjectValueX65b3194f()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingAuthorizationObjectValueX65b3194f = when (value) {
      IssuingAuthorization.value -> IssuingAuthorization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingAuthorizationObjectValueX65b3194f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationObjectValueX65b3194f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationObjectValueX65b3194f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationObjectValueX65b3194f) {
      encoder.encodeString(value.value)
    }
  }
}
