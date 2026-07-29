package com.nabobery.sdkgen.generated.stripe.externalaccounts

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.ExternalAccount
import com.nabobery.sdkgen.generated.stripe.InlineV1ExternalAccountsPostRequestFormX602302a3
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.runtime.BackoffHints
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.KotlinxSerializationCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.ResponseAlternative
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkParameterLocation
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkRequestParameter
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseDecodeResult
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SecurityRequirement
import com.nabobery.sdkgen.runtime.SecuritySchemeRef
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.SecurityScheme
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeAuthentication
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeBinding
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import com.nabobery.sdkgen.runtime.bodies.FormUrlEncodedBody
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonPrimitive

public object ExternalAccountsCodecs {
  public const val POSTEXTERNALACCOUNTSID_REQUEST_CODEC_ID: String =
      "PostExternalAccountsId.request"

  private val postExternalAccountsIdRequestCodec:
      MediaTypeCodec<InlineV1ExternalAccountsPostRequestFormX602302a3?> =
      PostExternalAccountsIdFormCodec

  private val postExternalAccountsIdResponseCodecAlternative0Codec: MediaTypeCodec<ExternalAccount>
      =
      KotlinxSerializationCodec("PostExternalAccountsId.response.alternative0", ExternalAccount.Serializer, SdkJson)

  public val postExternalAccountsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ExternalAccount> =
      MediaTypeCodecRegistry.of(postExternalAccountsIdResponseCodecAlternative0Codec)

  private val postExternalAccountsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostExternalAccountsId.response.alternative1", Error.Serializer, SdkJson)

  public val postExternalAccountsIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(postExternalAccountsIdResponseCodecAlternative1Codec)

  public val postExternalAccountsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ExternalAccountsPostRequestFormX602302a3?> =
      MediaTypeCodecRegistry.of(postExternalAccountsIdRequestCodec)

  public object PostExternalAccountsIdFormCodec : MediaTypeCodec<InlineV1ExternalAccountsPostRequestFormX602302a3?> {
    override val id: String = "PostExternalAccountsId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ExternalAccountsPostRequestFormX602302a3?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.accountHolderName?.let { formValue0 ->
        form.add("account_holder_name", formValue0)
      }
      request.accountHolderType?.let { formValue0 ->
        form.add("account_holder_type", formValue0.value)
      }
      request.accountType?.let { formValue0 ->
        form.add("account_type", formValue0.value)
      }
      request.addressCity?.let { formValue0 ->
        form.add("address_city", formValue0)
      }
      request.addressCountry?.let { formValue0 ->
        form.add("address_country", formValue0)
      }
      request.addressLine1?.let { formValue0 ->
        form.add("address_line1", formValue0)
      }
      request.addressLine2?.let { formValue0 ->
        form.add("address_line2", formValue0)
      }
      request.addressState?.let { formValue0 ->
        form.add("address_state", formValue0)
      }
      request.addressZip?.let { formValue0 ->
        form.add("address_zip", formValue0)
      }
      request.defaultForCurrency?.let { formValue0 ->
        form.add("default_for_currency", formValue0.toString())
      }
      request.documents?.let { formValue0 ->
        formValue0.bankAccountOwnershipVerification?.let { formValue2 ->
          formValue2.files?.let { formValue4 ->
            if (formValue4.isEmpty()) {
              form.add("documents" + "[bank_account_ownership_verification]" + "[files]", "")
            } else {
              formValue4.forEachIndexed { formIndex5, formElement5 ->
                form.add("documents" + "[bank_account_ownership_verification]" + "[files]" + "[" + formIndex5 + "]", formElement5)
              }
            }
          }
        }
      }
      request.expMonth?.let { formValue0 ->
        form.add("exp_month", formValue0)
      }
      request.expYear?.let { formValue0 ->
        form.add("exp_year", formValue0)
      }
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1ExternalAccountsPostRequestFormMetadataAnyOf2X20678b44).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.name?.let { formValue0 ->
        form.add("name", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ExternalAccountsPostRequestFormX602302a3? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'external_accounts' group of Stripe API.
 */
public class ExternalAccountsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "basicAuth" to SecurityScheme.HttpBasic,
        "bearerAuth" to SecurityScheme.HttpBearer(),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@ExternalAccountsClient.authentication)

  /**
   * <p>Updates the metadata, account holder name, account holder type of a bank account belonging to
   * a connected account and optionally sets it as the default for its currency. Other bank account
   * details are not editable by design.</p>
   *
   * <p>You can only update bank accounts when <a
   * href="/api/accounts/object#account_object-controller-requirement_collection">account.controller.requirement_collect
   * ion</a> is <code>application</code>, which includes <a href="/connect/custom-accounts">Custom accounts</a>.</p>
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postExternalAccountsIdWithResponse(
    request: InlineV1ExternalAccountsPostRequestFormX602302a3? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostExternalAccountsIdResponse> = executor.executeWithResponse<InlineV1ExternalAccountsPostRequestFormX602302a3?, PostExternalAccountsIdResponse>(SdkExecutionRequest(postExternalAccountsIdMetadata, baseUri, request, listOf(ExternalAccountsCodecs.POSTEXTERNALACCOUNTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), ExternalAccountsCodecs.postExternalAccountsIdRequestCodecRegistry, PostExternalAccountsIdResponseDecoder, options)

  /**
   * Typed response alternatives for `PostExternalAccountsId`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostExternalAccountsIdResponse {
    public class SuccessJson(
      public val json: ExternalAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostExternalAccountsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostExternalAccountsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostExternalAccountsIdResponse
  }

  private object PostExternalAccountsIdResponseDecoder : SdkResponseAlternativeDecoder<PostExternalAccountsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostExternalAccountsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostExternalAccountsIdResponse> = when {
      alternative.id == "PostExternalAccountsId.response.alternative0" -> SdkResponseDecodeResult(
        value = PostExternalAccountsIdResponse.SuccessJson(
          json = ExternalAccountsCodecs.postExternalAccountsIdResponseCodecAlternative0Registry.select(listOf("PostExternalAccountsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostExternalAccountsId.response.alternative1" -> SdkResponseDecodeResult(
        value = PostExternalAccountsIdResponse.DefaultJson(
          json = ExternalAccountsCodecs.postExternalAccountsIdResponseCodecAlternative1Registry.select(listOf("PostExternalAccountsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PostExternalAccountsIdResponse = PostExternalAccountsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val postExternalAccountsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostExternalAccountsId",
          method = "POST",
          path = "/v1/external_accounts/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ExternalAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "PostExternalAccountsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostExternalAccountsId.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }
  }
}
