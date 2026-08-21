package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Filters to restrict the kinds of accounts to collect.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1financial_connections~1sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/filters
 */
@Serializable(with = InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f.Serializer::class)
public class InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f(
  accountSubcategories: List<InlineV1FinancialConnectioc5dcPostRequestFormFiltersItemX8ff0a547>? = null,
  countries: List<String>? = null,
) {
  public val accountSubcategories:
      List<InlineV1FinancialConnectioc5dcPostRequestFormFiltersItemX8ff0a547>? =
      accountSubcategories?.let { collection0 -> collection0.toList() }

  public val countries: List<String>? = countries?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accountSubcategoriesValue:
        List<InlineV1FinancialConnectioc5dcPostRequestFormFiltersItemX8ff0a547>? = null

    public var accountSubcategories:
        List<InlineV1FinancialConnectioc5dcPostRequestFormFiltersItemX8ff0a547>?
      get() = accountSubcategoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        accountSubcategoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var countriesValue: List<String>? = null

    public var countries: List<String>?
      get() = countriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        countriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f = InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f(
      accountSubcategories = accountSubcategories,
      countries = countries,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f must be a JSON object")
      return InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f(
        accountSubcategories = rawObject["account_subcategories"]?.let { json.decodeFromJsonElement<List<InlineV1FinancialConnectioc5dcPostRequestFormFiltersItemX8ff0a547>>(it) },
        countries = rawObject["countries"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountSubcategories?.let { put("account_subcategories", json.encodeToJsonElement(it)) }
        value.countries?.let { put("countries", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f(block: InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f.Builder.() -> Unit): InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f = InlineV1FinancialConnectionsSessionsPostRequestFormFiltersX18327f2f.build(block)
