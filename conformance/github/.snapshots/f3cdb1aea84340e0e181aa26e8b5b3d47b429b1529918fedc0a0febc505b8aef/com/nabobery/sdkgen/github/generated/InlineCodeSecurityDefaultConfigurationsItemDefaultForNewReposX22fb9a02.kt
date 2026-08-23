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
 * The visibility of newly created repositories for which the code security configuration will be applied to by default
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-default-configurations/items/properties/default_for_ne
 * w_repos
 */
@Serializable(with = InlineCodeSecurityDefaultConfigurationsItemDefaultForNewReposX22fb9a02.Serializer::class)
public sealed class InlineCodeSecurityDefaultConfigurationsItemDefaultForNewReposX22fb9a02 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineCodeSecurityDefaultConfigurationsItemDefaultForNewReposX22fb9a02() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private_and_internal`.
   */
  public data object PrivateAndInternal : InlineCodeSecurityDefaultConfigurationsItemDefaultForNewReposX22fb9a02() {
    public override val `value`: String = "private_and_internal"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineCodeSecurityDefaultConfigurationsItemDefaultForNewReposX22fb9a02() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityDefaultConfigurationsItemDefaultForNewReposX22fb9a02()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityDefaultConfigurationsItemDefaultForNewReposX22fb9a02 = when (value) {
      Public.value -> Public
      PrivateAndInternal.value -> PrivateAndInternal
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeSecurityDefaultConfigurationsItemDefaultForNewReposX22fb9a02> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeSecurityDefaultConfigurationsItemDefaultForNewReposX22fb9a02", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityDefaultConfigurationsItemDefaultForNewReposX22fb9a02 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityDefaultConfigurationsItemDefaultForNewReposX22fb9a02) {
      encoder.encodeString(value.value)
    }
  }
}
