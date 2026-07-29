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
 * sdkgen://source/openapi.json#/paths/~1v1~1link_account_sessions/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/filters
 */
@Serializable(with = InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4.Serializer::class)
public class InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4(
  accountSubcategories: List<InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d>? = null,
  countries: List<String>? = null,
) {
  public val accountSubcategories:
      List<InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d>? =
      accountSubcategories?.let { collection0 -> collection0.toList() }

  public val countries: List<String>? = countries?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accountSubcategoriesValue:
        List<InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d>? = null

    public var accountSubcategories:
        List<InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d>?
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

    public fun build(): InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4 = InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4(
      accountSubcategories = accountSubcategories,
      countries = countries,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4 must be a JSON object")
      return InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4(
        accountSubcategories = rawObject["account_subcategories"]?.let { json.decodeFromJsonElement<List<InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d>>(it) },
        countries = rawObject["countries"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountSubcategories?.let { put("account_subcategories", json.encodeToJsonElement(it)) }
        value.countries?.let { put("countries", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4(block: InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4.Builder.() -> Unit): InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4 = InlineV1LinkAccountSessionsPostRequestFormFiltersXa834bef4.build(block)
