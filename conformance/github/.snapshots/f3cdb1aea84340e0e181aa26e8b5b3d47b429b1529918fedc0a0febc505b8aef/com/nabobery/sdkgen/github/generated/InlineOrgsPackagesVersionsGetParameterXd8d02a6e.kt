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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1packages~1{package_type}~1{package_name}~1versions/get/parameters/
 * 5/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1packages~1{package_type}~1{package_name}~1versions/get/parameters/
 * 5/schema
 */
@Serializable(with = InlineOrgsPackagesVersionsGetParameterXd8d02a6e.Serializer::class)
public sealed class InlineOrgsPackagesVersionsGetParameterXd8d02a6e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineOrgsPackagesVersionsGetParameterXd8d02a6e() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineOrgsPackagesVersionsGetParameterXd8d02a6e() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsPackagesVersionsGetParameterXd8d02a6e()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsPackagesVersionsGetParameterXd8d02a6e = when (value) {
      Active.value -> Active
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsPackagesVersionsGetParameterXd8d02a6e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsPackagesVersionsGetParameterXd8d02a6e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsPackagesVersionsGetParameterXd8d02a6e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPackagesVersionsGetParameterXd8d02a6e) {
      encoder.encodeString(value.value)
    }
  }
}
