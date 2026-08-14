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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/entitlements.feature/properties/object
 */
@Serializable(with = InlineEntitlementsFeatureObjectValueX1e9918cd.Serializer::class)
public sealed class InlineEntitlementsFeatureObjectValueX1e9918cd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `entitlements.feature`.
   */
  public data object EntitlementsFeature : InlineEntitlementsFeatureObjectValueX1e9918cd() {
    public override val `value`: String = "entitlements.feature"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEntitlementsFeatureObjectValueX1e9918cd()

  public companion object {
    public fun fromValue(`value`: String): InlineEntitlementsFeatureObjectValueX1e9918cd = when (value) {
      EntitlementsFeature.value -> EntitlementsFeature
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEntitlementsFeatureObjectValueX1e9918cd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineEntitlementsFeatureObjectValueX1e9918cd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEntitlementsFeatureObjectValueX1e9918cd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEntitlementsFeatureObjectValueX1e9918cd) {
      encoder.encodeString(value.value)
    }
  }
}
