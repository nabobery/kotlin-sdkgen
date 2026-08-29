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
 * Specify which types of repository this security configuration should be applied to by default.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations~1{configuration_id}~1d
 * efaults/put/requestBody/content/application~1json/schema/properties/default_for_new_repos
 */
@Serializable(with = InlineEnterprisesCodeSecurd892PutRequestJsonDefaultForNewReposXd8d734d6.Serializer::class)
public sealed class InlineEnterprisesCodeSecurd892PutRequestJsonDefaultForNewReposXd8d734d6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineEnterprisesCodeSecurd892PutRequestJsonDefaultForNewReposXd8d734d6() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineEnterprisesCodeSecurd892PutRequestJsonDefaultForNewReposXd8d734d6() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `private_and_internal`.
   */
  public data object PrivateAndInternal : InlineEnterprisesCodeSecurd892PutRequestJsonDefaultForNewReposXd8d734d6() {
    public override val `value`: String = "private_and_internal"
  }

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineEnterprisesCodeSecurd892PutRequestJsonDefaultForNewReposXd8d734d6() {
    public override val `value`: String = "public"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesCodeSecurd892PutRequestJsonDefaultForNewReposXd8d734d6()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesCodeSecurd892PutRequestJsonDefaultForNewReposXd8d734d6 = when (value) {
      All.value -> All
      None.value -> None
      PrivateAndInternal.value -> PrivateAndInternal
      Public.value -> Public
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEnterprisesCodeSecurd892PutRequestJsonDefaultForNewReposXd8d734d6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineEnterprisesCodeSecurd892PutRequestJsonDefaultForNewReposXd8d734d6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecurd892PutRequestJsonDefaultForNewReposXd8d734d6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecurd892PutRequestJsonDefaultForNewReposXd8d734d6) {
      encoder.encodeString(value.value)
    }
  }
}
