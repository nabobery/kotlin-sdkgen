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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_application/properties/object
 */
@Serializable(with = InlineDeletedApplicationObjectValueXa6bda42e.Serializer::class)
public sealed class InlineDeletedApplicationObjectValueXa6bda42e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `application`.
   */
  public data object Application : InlineDeletedApplicationObjectValueXa6bda42e() {
    public override val `value`: String = "application"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedApplicationObjectValueXa6bda42e()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedApplicationObjectValueXa6bda42e = when (value) {
      Application.value -> Application
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedApplicationObjectValueXa6bda42e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDeletedApplicationObjectValueXa6bda42e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedApplicationObjectValueXa6bda42e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedApplicationObjectValueXa6bda42e) {
      encoder.encodeString(value.value)
    }
  }
}
