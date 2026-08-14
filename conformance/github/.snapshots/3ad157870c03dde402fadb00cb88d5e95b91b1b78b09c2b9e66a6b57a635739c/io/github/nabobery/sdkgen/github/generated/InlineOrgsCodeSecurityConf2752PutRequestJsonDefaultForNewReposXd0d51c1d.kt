package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Specify which types of repository this security configuration should be applied to by default.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}~1defaults/put/re
 * questBody/content/application~1json/schema/properties/default_for_new_repos
 */
@Serializable(with = InlineOrgsCodeSecurityConf2752PutRequestJsonDefaultForNewReposXd0d51c1d.Serializer::class)
public sealed class InlineOrgsCodeSecurityConf2752PutRequestJsonDefaultForNewReposXd0d51c1d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsCodeSecurityConf2752PutRequestJsonDefaultForNewReposXd0d51c1d() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineOrgsCodeSecurityConf2752PutRequestJsonDefaultForNewReposXd0d51c1d() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `private_and_internal`.
   */
  public data object PrivateAndInternal : InlineOrgsCodeSecurityConf2752PutRequestJsonDefaultForNewReposXd0d51c1d() {
    public override val `value`: String = "private_and_internal"
  }

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineOrgsCodeSecurityConf2752PutRequestJsonDefaultForNewReposXd0d51c1d() {
    public override val `value`: String = "public"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConf2752PutRequestJsonDefaultForNewReposXd0d51c1d()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConf2752PutRequestJsonDefaultForNewReposXd0d51c1d = when (value) {
      All.value -> All
      None.value -> None
      PrivateAndInternal.value -> PrivateAndInternal
      Public.value -> Public
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConf2752PutRequestJsonDefaultForNewReposXd0d51c1d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConf2752PutRequestJsonDefaultForNewReposXd0d51c1d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConf2752PutRequestJsonDefaultForNewReposXd0d51c1d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConf2752PutRequestJsonDefaultForNewReposXd0d51c1d) {
      encoder.encodeString(value.value)
    }
  }
}
