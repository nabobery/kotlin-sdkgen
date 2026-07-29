package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_balance_summary/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_balance_summary/get/parameters/3/schema
 */
@Serializable(with = InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a.Serializer::class)
public class InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a(
  public val type: InlineV1BillingCreditBalanceSummaryGetParameterTypeX3dbbbde3,
  public val applicabilityScope:
      InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030? = null,
  public val creditGrant: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1BillingCreditBalanceSummaryGetParameterTypeX3dbbbde3? = null

    public var type: InlineV1BillingCreditBalanceSummaryGetParameterTypeX3dbbbde3
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var applicabilityScope:
        InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030? = null

    public var creditGrant: String? = null

    public fun build(): InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a {
      check(typeValue != null) { "type is required" }
      return InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a(
        type = type,
        applicabilityScope = applicabilityScope,
        creditGrant = creditGrant,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a must be a JSON object")
      val type = json.decodeRequired<InlineV1BillingCreditBalanceSummaryGetParameterTypeX3dbbbde3>(rawObject, "type")
      return InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a(
        type = type,
        applicabilityScope = rawObject["applicability_scope"]?.let { json.decodeFromJsonElement<InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030>(it) },
        creditGrant = rawObject["credit_grant"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.applicabilityScope?.let { put("applicability_scope", json.encodeToJsonElement(it)) }
        value.creditGrant?.let { put("credit_grant", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a(block: InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a.Builder.() -> Unit): InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a = InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingCreditBalanceSummaryGetParameterX60ba0d7a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
