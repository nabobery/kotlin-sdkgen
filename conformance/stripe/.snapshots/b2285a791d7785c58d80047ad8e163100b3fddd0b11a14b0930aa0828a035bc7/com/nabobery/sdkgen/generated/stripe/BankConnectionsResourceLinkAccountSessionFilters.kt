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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_link_account_session_filters
 */
@Serializable(with = BankConnectionsResourceLinkAccountSessionFilters.Serializer::class)
public class BankConnectionsResourceLinkAccountSessionFilters(
  accountSubcategories: List<InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421>? = null,
  countries: List<String>? = null,
) {
  /**
   * Restricts the Session to subcategories of accounts that can be linked. Valid subcategories are: `checking`,
   * `savings`, `mortgage`, `line_of_credit`, `credit_card`.
   */
  public val accountSubcategories:
      List<InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421>? =
      accountSubcategories?.let { collection0 -> collection0.toList() }

  /**
   * List of countries from which to filter accounts.
   */
  public val countries: List<String>? = countries?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accountSubcategoriesValue:
        List<InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421>? = null

    /**
     * Restricts the Session to subcategories of accounts that can be linked. Valid subcategories are: `checking`,
     * `savings`, `mortgage`, `line_of_credit`, `credit_card`.
     */
    public var accountSubcategories:
        List<InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421>?
      get() = accountSubcategoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        accountSubcategoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var countriesValue: List<String>? = null

    /**
     * List of countries from which to filter accounts.
     */
    public var countries: List<String>?
      get() = countriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        countriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): BankConnectionsResourceLinkAccountSessionFilters = BankConnectionsResourceLinkAccountSessionFilters(
      accountSubcategories = accountSubcategories,
      countries = countries,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BankConnectionsResourceLinkAccountSessionFilters = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BankConnectionsResourceLinkAccountSessionFilters> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BankConnectionsResourceLinkAccountSessionFilters {
      val jsonDecoder = decoder.requireJsonDecoder("BankConnectionsResourceLinkAccountSessionFilters")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BankConnectionsResourceLinkAccountSessionFilters must be a JSON object")
      return BankConnectionsResourceLinkAccountSessionFilters(
        accountSubcategories = rawObject["account_subcategories"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineBankConnectionsResoud108AccountSubcategoriesItemX14777421>?>(element) },
        countries = rawObject["countries"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BankConnectionsResourceLinkAccountSessionFilters) {
      val jsonEncoder = encoder.requireJsonEncoder("BankConnectionsResourceLinkAccountSessionFilters")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountSubcategories?.let { put("account_subcategories", json.encodeToJsonElement(it)) }
        value.countries?.let { put("countries", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bankConnectionsResourceLinkAccountSessionFilters(block: BankConnectionsResourceLinkAccountSessionFilters.Builder.() -> Unit): BankConnectionsResourceLinkAccountSessionFilters = BankConnectionsResourceLinkAccountSessionFilters.build(block)
