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
 * Source: sdkgen://source/openapi.json#/components/schemas/apps.secret/properties/object
 */
@Serializable(with = InlineAppsSecretObjectValueX998e84c6.Serializer::class)
public sealed class InlineAppsSecretObjectValueX998e84c6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apps.secret`.
   */
  public data object AppsSecret : InlineAppsSecretObjectValueX998e84c6() {
    public override val `value`: String = "apps.secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppsSecretObjectValueX998e84c6()

  public companion object {
    public fun fromValue(`value`: String): InlineAppsSecretObjectValueX998e84c6 = when (value) {
      AppsSecret.value -> AppsSecret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppsSecretObjectValueX998e84c6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAppsSecretObjectValueX998e84c6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppsSecretObjectValueX998e84c6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppsSecretObjectValueX998e84c6) {
      encoder.encodeString(value.value)
    }
  }
}
