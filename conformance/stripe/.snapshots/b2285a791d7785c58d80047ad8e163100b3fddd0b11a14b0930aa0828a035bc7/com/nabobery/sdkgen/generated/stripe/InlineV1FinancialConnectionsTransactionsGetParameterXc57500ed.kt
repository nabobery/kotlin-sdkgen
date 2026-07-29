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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1transactions/get/parameters/6/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1transactions/get/parameters/6/schema
 */
@Serializable(with = InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed.Serializer::class)
public class InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed(
  public val after: String,
) {
  public class Builder {
    private var afterValue: String? = null

    public var after: String
      get() = requireNotNull(afterValue) { "after is required" }
      set(`value`) {
        afterValue = value
      }

    public fun build(): InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed {
      check(afterValue != null) { "after is required" }
      return InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed(
        after = after,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed must be a JSON object")
      val after = json.decodeRequired<String>(rawObject, "after")
      return InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed(
        after = after,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("after", value.after)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1FinancialConnectionsTransactionsGetParameterXc57500ed(block: InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed.Builder.() -> Unit): InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed = InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
