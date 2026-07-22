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
 * CodeQL query suite to be used. If you specify the `query_suite` parameter, the default setup will be configured with
 * this query suite only on all repositories that didn't have default setup already configured. It will not change the
 * query suite on repositories that already have default setup configured.
 * If you don't specify any `query_suite` in your request, the preferred query suite of the organization will be
 * applied.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1{security_product}~1{enablement}/post/requestBody/content/applicat
 * ion~1json/schema/properties/query_suite
 */
@Serializable(with = InlineOrgsPostRequestJsonQuerySuiteXbb507ac3.Serializer::class)
public sealed class InlineOrgsPostRequestJsonQuerySuiteXbb507ac3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `default`.
   */
  public data object Default : InlineOrgsPostRequestJsonQuerySuiteXbb507ac3() {
    public override val `value`: String = "default"
  }

  /**
   * Documented value. Wire value: `extended`.
   */
  public data object Extended : InlineOrgsPostRequestJsonQuerySuiteXbb507ac3() {
    public override val `value`: String = "extended"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsPostRequestJsonQuerySuiteXbb507ac3()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsPostRequestJsonQuerySuiteXbb507ac3 = when (value) {
      Default.value -> Default
      Extended.value -> Extended
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsPostRequestJsonQuerySuiteXbb507ac3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsPostRequestJsonQuerySuiteXbb507ac3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsPostRequestJsonQuerySuiteXbb507ac3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPostRequestJsonQuerySuiteXbb507ac3) {
      encoder.encodeString(value.value)
    }
  }
}
