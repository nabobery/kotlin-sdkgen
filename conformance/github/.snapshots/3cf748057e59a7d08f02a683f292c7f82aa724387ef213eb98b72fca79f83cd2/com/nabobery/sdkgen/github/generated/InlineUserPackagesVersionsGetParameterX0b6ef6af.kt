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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1user~1packages~1{package_type}~1{package_name}~1versions/get/parameters/4/schem
 * a.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1packages~1{package_type}~1{package_name}~1versions/get/parameters/4/schem
 * a
 */
@Serializable(with = InlineUserPackagesVersionsGetParameterX0b6ef6af.Serializer::class)
public sealed class InlineUserPackagesVersionsGetParameterX0b6ef6af {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineUserPackagesVersionsGetParameterX0b6ef6af() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineUserPackagesVersionsGetParameterX0b6ef6af() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserPackagesVersionsGetParameterX0b6ef6af()

  public companion object {
    public fun fromValue(`value`: String): InlineUserPackagesVersionsGetParameterX0b6ef6af = when (value) {
      Active.value -> Active
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineUserPackagesVersionsGetParameterX0b6ef6af> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserPackagesVersionsGetParameterX0b6ef6af", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserPackagesVersionsGetParameterX0b6ef6af = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserPackagesVersionsGetParameterX0b6ef6af) {
      encoder.encodeString(value.value)
    }
  }
}
